import { Component, Input, OnInit } from '@angular/core';
import {MapTo} from '@adobe/cq-angular-editable-components';

const HelloworldEditConfig = {
  emptyLabel: 'Custom Component',
  isEmpty: cqModel =>
    !cqModel || !cqModel.message || cqModel.message.trim().length < 1
};

@Component({
  selector: 'app-helloworld',
  templateUrl: './helloworld.component.html',
  styleUrls: ['./helloworld.component.css']
})
export class HelloworldComponent implements OnInit {

  @Input() text: string;
  @Input() message: string;

  constructor() { }

  ngOnInit(): void {
  }

}

MapTo('wknd-spa-angular/components/helloworld')(HelloworldComponent, HelloworldEditConfig);

