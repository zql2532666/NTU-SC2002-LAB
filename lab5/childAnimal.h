#include <string>
#include <iostream>
#include "Animal.h"
using namespace std;

class Dog: public Mammal {
    private:
        string _owner;
    
    public:
        Dog(string name, COLOR color, string owner) : Mammal(name, color) {
            _owner = owner;
        }

        Dog() {}

        ~Dog() {
            cout << " destroying Dog object " << endl;
        }

        void speak() override {
            cout << "Woof" << endl;
        }

        void move() override {
            cout << "dog moves" << endl;
        }
};

class Cat : public Mammal {
    public:
        Cat(string name, COLOR color) : Mammal(name, color) {}
        Cat() {}
        ~Cat() {}

        void move() override {
            cout << "cat moves" << endl;
        } 

        void speak() override {
            cout << "meow" << endl;
        } 
};

class Lion: public Mammal {
    public:
        Lion(string name, COLOR color): Mammal(name, color) {}
        Lion() {}
        ~Lion() {}

        void move() override {
            cout << "lion moves" << endl;
        } 

        void speak() override {
            cout << "roar" << endl;
        }
};