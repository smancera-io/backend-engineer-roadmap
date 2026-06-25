package ENUM;

public enum EstadoVehiculo {
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

    public abstract boolean puedeOperar();
}