package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

public enum PeriodoTiempo {
    DIAS, SEMANAS, MESES, ANIOS;

    public static PeriodoTiempo obtenerPeriodoTiempo(Integer numeroPeriodo) {
        switch (numeroPeriodo){
            case 1: return DIAS;
            case 2: return SEMANAS;
            case 3: return MESES;
            default: return ANIOS;
        }
    }

    @Override
    public String toString() {
        switch (this){
            case DIAS: return "dias";
            case SEMANAS: return "semanas";
            case MESES: return "meses";
            case ANIOS: return "años";
            default: return "horas";
        }
    }
}
