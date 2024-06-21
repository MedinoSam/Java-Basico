package entreface.estabelecimento;

import entreface.equipamentos.multifuncional.EquipamentoMultifuncional;


public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        em.imprimir();
        em.copiar();
        em.digitalizar();
        
    }
}
