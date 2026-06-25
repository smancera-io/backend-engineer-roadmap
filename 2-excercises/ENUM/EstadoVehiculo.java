package ENUM;

public enum EstadoVehiculo {
    /* Create Enum states */
    ACTIVO {
        @Override
        public boolean puedeOperar() {
            return true;
        }
    },
    EN_MANTENIMIENTO {
        @Override
        public boolean puedeOperar() {
            return false;
        }
    },
    DADO_DE_BAJA {
        @Override
        public boolean puedeOperar() {
            return false;
        }
    };

    /* Create abstract method */
    public abstract boolean puedeOperar();
}