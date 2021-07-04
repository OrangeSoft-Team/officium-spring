package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

public enum EnumEstadoOfertaLaboral {
    PUBLICADA, CANCELADA;

    public char toChar(){
        switch (this){
            case PUBLICADA: return 'P';
            case CANCELADA: return 'C';
            default: return 'P';
        }
    }
}
