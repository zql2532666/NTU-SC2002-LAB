#include <string>
#include <iostream>
using namespace std;

#ifndef ANIMAL
#define ANIMAL

enum COLOR {Green, Blue, White, Black, Brown};

class Animal {
    private:
        string _name;
        COLOR _color;

    public:
        Animal(string name, COLOR color) {
            _name = name;
            _color = color;
            cout << " Animal name: " << _name << ", color: " << _color << endl;
        }

        Animal(): _name("unknown") {
            cout << " constructing Animal object " << _name << endl;
        }

        ~Animal() {
            cout << " destroying Animal object " << _name << endl;
        }

        virtual void speak() {
            cout << "Animal speaks " << endl;
        }

        virtual void move() = 0;
};

class Mammal: public Animal {
    public:
        Mammal(string name, COLOR color) : Animal(name, color){
        }

        Mammal() {}

        ~Mammal() {
            cout << " destroying Mammal object " << endl;
        }

        void eat() const {
            cout << "Mammal eats " << endl;
        }

        void move() override {
            cout << "Mammal moves " << endl;
        }
};

#endif