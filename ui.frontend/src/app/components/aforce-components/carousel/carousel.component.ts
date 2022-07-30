import { Component, Input } from '@angular/core';
import { MapTo } from '@adobe/cq-angular-editable-components';

const carouselEditConfig = {
  emptyLabel: 'carousel',
  isEmpty: cqModel =>
    !cqModel || !cqModel.items || cqModel.items.length < 1
};

@Component({
  selector: 'app-carousel',
  templateUrl: './carousel.component.html',
  styleUrls: ['./carousel.component.scss']
})
export class CarouselComponent {

  @Input() items: object[];

}

MapTo('wknd-spa-angular/components/aforce-components/carousel')(CarouselComponent, carouselEditConfig);
