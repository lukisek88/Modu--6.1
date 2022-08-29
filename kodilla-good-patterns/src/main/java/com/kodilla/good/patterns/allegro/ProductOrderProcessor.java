package com.kodilla.good.patterns.allegro;

    public class ProductOrderProcessor {
        private InformationService informationService;
        private ProductOrderService productOrderService;
        private ProductOrderRepo productOrderRepo;

        public ProductOrderProcessor(InformationService informationService,
                                     ProductOrderService productOrderService,
                                     ProductOrderRepo productOrderRepo) {
            this.informationService = informationService;
            this.productOrderService = productOrderService;
            this.productOrderRepo = productOrderRepo;
        }

        public ProductOrderInfo process(ProductOrderRequest productOrderRequest) {
            boolean isSuccessfullySold = productOrderService.sold(productOrderRequest.getUser(),
                    productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());
            if (isSuccessfullySold) {
                informationService.info(productOrderRequest.getUser(),productOrderRequest.getProduct());
                productOrderRepo.createProductOrder(productOrderRequest.getUser(),
                        productOrderRequest.getOrderDate(),
                        productOrderRequest.getProduct(),
                        productOrderRequest.getQuantity());
            }else{
                System.out.println("There was an order error, please try again later");
            }

            return new ProductOrderInfo(productOrderRequest.getUser(),
                    productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity(),
                    isSuccessfullySold);
        }
}
