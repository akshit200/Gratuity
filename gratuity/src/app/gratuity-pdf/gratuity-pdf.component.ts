import { Component, OnInit } from '@angular/core';

import { ViewChild, ElementRef } from '@angular/core';
import * as jsPDF from 'jspdf';

@Component({
  selector: 'app-gratuity-pdf',
  templateUrl: './gratuity-pdf.component.html',
  styleUrls: ['./gratuity-pdf.component.css']
})

export class GratuityPdfComponent implements OnInit {

  constructor() { }

  ngOnInit() {

  }

  @ViewChild('pdfTable', {static: false}) pdfTable: ElementRef;


  public downloadAsPDF() {
    const doc = new jsPDF();

    const specialElementHandlers = {
      '#editor': function (element, renderer) {
        return true;
      }
    };

    const pdfTable = this.pdfTable.nativeElement;

    doc.fromHTML(pdfTable.innerHTML, 15, 15, {
      width: 190,
      'elementHandlers': specialElementHandlers
    });

    doc.save('GratuityPdf.pdf');
  }


  
  printPage() {
    window.print();
  }
 
}
