//
//  ViewController.swift
//  iosApp
//
//  Created by Daniel Ghebrat on 18/03/2022.
//

import UIKit
import shared
class ViewController: UIViewController {

    
    let greet = Greeting().greeting()
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    print("Greeting earthlings \(greet)")
    }


}

