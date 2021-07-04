package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

public enum PeriodoTiempo {
    DIAS, SEMANAS, MESES, ANIOS;

    public static PeriodoTiempo obtenerPeriodoTiempo(String periodo) {
        switch (periodo){
            case "dias": return DIAS;
            case "semanas": return SEMANAS;
            case "meses": return MESES;
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
