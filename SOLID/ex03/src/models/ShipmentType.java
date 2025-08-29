package models;

import services.ExpressShippingCostCalculator;
import services.OvernightShippingCostCalculator;
import services.ShippingCostCalculator;
import services.StandardShippingCostCalculator;

public enum ShipmentType {

    STANDARD {
        @Override
        public ShippingCostCalculator getCalculator() {
            ShippingCostCalculator shippingCostCalculator = new StandardShippingCostCalculator();
            return shippingCostCalculator;
        }
    },

    EXPRESS {

        @Override
        public ShippingCostCalculator getCalculator() {
            ShippingCostCalculator shippingCostCalculator = new ExpressShippingCostCalculator();
            return shippingCostCalculator;
        }
    },

    OVERNIGHT {
        @Override
        public ShippingCostCalculator getCalculator() {
            ShippingCostCalculator shippingCostCalculator = new OvernightShippingCostCalculator();
            return shippingCostCalculator;
        }
    };

    public abstract ShippingCostCalculator getCalculator();
}
