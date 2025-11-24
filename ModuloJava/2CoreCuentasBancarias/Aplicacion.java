import java.util.ArrayList;

import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {

        Persona persona1 = new Persona("María González", 28);
        Persona persona2 = new Persona("Carlos Ramírez", 35);
        Persona persona3 = new Persona("Ana Martínez", 42);

        CuentaBancaria cuenta1 = new CuentaBancaria(1500.00, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(2500.00, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(5000.00, persona3);

        System.out.println("💸✨ OPERACIONES EN CUENTA 1 ✨💸");
        cuenta1.depositar(500.00);
        cuenta1.retirar(200.00);
        System.out.println();

        System.out.println("💸✨ OPERACIONES EN CUENTA 2 ✨💸");
        cuenta2.depositar(1000.00);
        cuenta2.retirar(3000.00);
        cuenta2.retirar(500.00);
        System.out.println();

        System.out.println("💸✨ OPERACIONES EN CUENTA 3 ✨💸");
        cuenta3.retirar(1500.00);
        cuenta3.depositar(2000.00);
        System.out.println();

        System.out.println("💰SALDOS ACTUALES 💰");
        System.out.println("Saldo Cuenta 1: $" + cuenta1.getSaldo());
        System.out.println("Saldo Cuenta 2: $" + cuenta2.getSaldo());
        System.out.println("Saldo Cuenta 3: $" + cuenta3.getSaldo());
        System.out.println();

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
