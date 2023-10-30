#include <iostream>
#include <string>
#include <vector>
#include "Animal.h"
#include "childAnimal.h"

using namespace std;

int main() {
    // Q1
    // Animal a("dog", Blue);
    // a.speak();

    // Mammal m("m1", Green);
    // m.speak();

    // Dog dogi("Lassie", White, "Andy");
    // Mammal *aniPtr = &dogi;
    // Mammal &aniRef = dogi;
    // Mammal aniVal = dogi;

    // aniPtr->speak();
    // aniRef.speak();
    // aniVal.speak();

    // cout << "Program exiting ..." << endl;

    vector<Mammal*> mammals; // Store selected mammals in a vector

    while (true) {
        std::cout << "Select the animal to send to Zoo:\n"
                  << "(1) Dog  (2) Cat  (3) Lion  (4) Move all animals  (5) Quit: ";
        int choice;
        std::cin >> choice;

        if (choice == 5) {
            break; // Quit the program 
        } else if (choice >= 1 && choice <= 3) {
            if (choice == 1) {
                Dog *d = new Dog();
                mammals.push_back(d);
            } else if (choice == 2) {
                Cat *c = new Cat();
                mammals.push_back(c);
            } else {
                Lion *l = new Lion();
                mammals.push_back(l);
            }
             // Add selected animal to the vector
        } else if (choice == 4) {
            // Move, speak, and eat all animals in the vector
            for (Mammal* mPtr : mammals) {
                mPtr->move();
                mPtr->speak();
                mPtr->eat();
                cout << endl;
            }
        } else {
            std::cout << "Invalid choice. Please try again." << std::endl;
        }
    }

    return 0;
    
}