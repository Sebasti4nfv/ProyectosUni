#include<iostream>
#include<string>

using namespace std;
class Alumno
{
	//Variables Miembro
	private:
		string 	codigo;
		string	nomApe;
		float	pc1;
		float	pc2;
	public:
		//Constructor				
		
	//Modificadores de acceso
		//SET
		void setCodigo(string cod);
		void setNomApe(string nApe);
		void setN1(float n1);
		void setN2(float n2);
		//GET	
		string 	getCodigo();
		string 	getNomApe();
		float	getPc1();
		float	getPc2();
		//Operaciones
		float	getPromedio();
};

void Alumno::setCodigo(string codigo)
{
	this->codigo = codigo;	
}
void Alumno::setNomApe(string nApe)
{
	this->nomApe = nApe;	
}
void Alumno::setN1(float n1)
{
	pc1 = n1;	
}
void Alumno::setN2(float n2)
{
	pc2 = n2;
}

//GET
string Alumno::getCodigo()
{
	return this->codigo;
}
string Alumno::getNomApe()
{
	return this->nomApe;
}
float Alumno::getPc1()
{
	return this->pc1;
}
float Alumno::getPc2()
{
	return this->pc2;
}
//Operaciones
float Alumno::getPromedio()
{
	return (this->pc1 + this->pc2)/2;
}


