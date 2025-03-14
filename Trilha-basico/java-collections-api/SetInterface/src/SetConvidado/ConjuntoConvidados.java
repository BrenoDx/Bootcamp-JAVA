/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetConvidado;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author breno
 */
public class ConjuntoConvidados {

    private Set<Convidado> setConvidado;

    public ConjuntoConvidados() {
        this.setConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        setConvidado.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigo) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : setConvidado) {
            if (c.getCodigoConvite() == codigo) {
                convidadoParaRemover = c;
                break;
            }
        }
        setConvidado.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return setConvidado.size();
    }

    public void exibirConvidados() {
        System.out.println(setConvidado);
    }
}
