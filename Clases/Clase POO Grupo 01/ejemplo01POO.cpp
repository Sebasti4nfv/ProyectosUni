#include<iostream>
#include"alumno.h"
using namespace std;

int main()
{
	//Crear la instancia - Crear el Objeto 01
	Alumno objAlumno1;
	
	//Crear un Objeto de la clase
	objAlumno1.setCodigo("001");
	objAlumno1.setNomApe("Daniel");
	objAlumno1.setN1(15);
	objAlumno1.setN2(15);
	//Imprimir
	cout << "Codigo: " << objAlumno1.getCodigo() << "\t";
	cout << "Nombre: " << objAlumno1.getNomApe() << "\t";
	cout << "Primera practica: " << objAlumno1.getPc1() << "\t";
	cout << "Segunda practica: " << objAlumno1.getPc2()<< "\t";
	cout <<"El promedio final:"<<objAlumno1.getPromedio()<<endl;
	
	//Crear el Objeto 02
	Alumno objAlumno2;
	
	objAlumno2.setCodigo("002");
	objAlumno2.setNomApe("Daniel Díaz");
	objAlumno2.setN1(20);
	objAlumno2.setN2(15);

	cout << "Codigo: " << objAlumno2.getCodigo() << "\t";
	cout << "Nombre: " << objAlumno2.getNomApe() << "\t";
	cout << "Primera pratica: " << objAlumno2.getPc1() << "\t";
	cout << "Segunda pratica: " << objAlumno2.getPc2()<<endl;
	cout <<"El promedio final:"<<objAlumno2.getPromedio()<<endl;
}

