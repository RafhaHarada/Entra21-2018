package senior1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
class Programa implements INotaFiscal{
    
    Programa(){
        Parcelas();
    }
    
@Override
    public List<Double> geraParcela(int nrParcela, double valorTotal) {
        List<Double> parcelas = new ArrayList<>();
        double valorParcela = 0;
        double auxiliar = valorTotal - ((int) valorTotal);
        double auxiliar2 = valorTotal - auxiliar;
        String dizima[] = ((valorTotal/nrParcela)+"").replace(".", "-").split("-");
        
        if (dizima[1].length() <= 2) {
            for (int i = 0; i < nrParcela; i++) {
                parcelas.add(valorTotal / nrParcela);
            }
        } else {
            for (int j = 0; j < nrParcela; j++) {
                String dizima2[] = ((auxiliar2/nrParcela)+"").replace(".", "-").split("-");
                if (dizima2[1].length() <= 2) {
                    if(j == (nrParcela-1)){
                        parcelas.add(auxiliar2 / nrParcela + auxiliar);
                    } else {
                        parcelas.add(auxiliar2 / nrParcela);
                    }
                } else {
                    auxiliar2 = Double.parseDouble(String.format("%.2f", auxiliar2 - 0.01).replace(",", "."));
                    auxiliar = Double.parseDouble(String.format("%.2f", auxiliar + 0.01).replace(",", "."));
                    j=-1;
                }
            }
        }
        return parcelas;
                
    }
    
    public void Parcelas(){
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total"));
        int nrParcela = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de parcelas"));
        List<Double> parcelas = geraParcela(nrParcela, valorTotal);
        String texto = "Numero de parcelas: " + nrParcela + "\nValor total: R$"+valorTotal;
        for (int i = 0; i < parcelas.size(); i++) {
            texto += "\nR$" + parcelas.get(i);
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}
