package com.hvdbs.myapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.LinkElement;
import com.google.gwt.event.logical.shared.InitializeEvent;
import com.google.gwt.event.logical.shared.InitializeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

public class TestWidget extends Composite {
    private static TestWidgetUiBinder uiBinder = GWT.create(TestWidgetUiBinder.class);
    @UiField
    FlexTable flex;

    interface TestWidgetUiBinder extends UiBinder<Widget, TestWidget> { }

    @UiField
    VerticalPanel myPanelContent;
    @UiField
    Grid grid1;

    public TestWidget() {
        initWidget(uiBinder.createAndBindUi(this));

        Element e = grid1.getCellFormatter().getElement(0, 1);
        e.setAttribute("rowspan", "2");
        e = grid1.getCellFormatter().getElement(0, 3);
        e.setAttribute("rowspan", "2");
        e = grid1.getCellFormatter().getElement(0, 5);
        e.setAttribute("rowspan", "2");
        e = grid1.getCellFormatter().getElement(0, 7);
        e.setAttribute("rowspan", "2");

        RichTextArea richTextArea = new RichTextArea();

        richTextArea.addInitializeHandler(new InitializeHandler() {
            public void onInitialize(InitializeEvent event) {
                richTextArea.getFormatter().setFontName("\"Trebuchet MS\",Trebuchet,Arial");
                richTextArea.getFormatter().setFontSize(RichTextArea.FontSize.XX_LARGE);
                richTextArea.getFormatter().setForeColor("#FF0000");

                String url = "https://stackoverflow.com/questions/52799672/i-am-not-able-to-convert-int-to-boolean-in-java-in-the-following-code";
                Anchor anchor1 = new Anchor(url, url, "_blank");
                anchor1.setStyleName(null);

                richTextArea.getFormatter().insertHTML(anchor1.toString());
                //richTextArea.setHTML(anchor1.getHref());
            }
        });

        myPanelContent.add(richTextArea);

        //add text to text area
        //  richTextArea.setHTML("<b>Hello World!</b> <br/> <br/>" +
        //       "<i>Be Happy!</i> </br> <br/> <u>Stay Cool!</u>");


      /*  HTML html1 = new HTML();
        html1.setHTML("<a href='http://www.google.com'>Click me!</a>");
        myPanelContent.add(html1);
        HTML html2 = new HTML();
        html2.setHTML("This is my sample <b>content</b>!");
        myPanelContent.add(html2);*/

        //richTextArea.setText("kljkljljljljljljlj");


        //Header
        flex.setWidget(0,0, new Label("Направление"));
        flex.setWidget(0,1, new Label("Доля времени"));
        flex.setWidget(0,2, new Label("Показатель"));
        flex.setWidget(0,3, new Label("План"));
        flex.setWidget(0,4, new Label("Факт"));
        flex.setWidget(0,5, new Label("Выполнение"));
        flex.setWidget(0,6, new Label("К оценки"));
        flex.setWidget(0,7, new Label("Вес КПЭ"));

        flex.setText(1, 0, "Списание");
        flex.setText(1, 1, "26%");
        flex.setText(1, 2, "Recovery Rate группы РМ ОДПЗ");
        flex.setText(1, 3, "27.84%");
        flex.setText(1, 4, "24.46%");
        flex.setText(1, 5, "90.7%");
        flex.setText(1, 6, "0.87");
        flex.setText(1, 7, "30%");

        flex.setText(2, 0, "Активация группы РМ ОДПЗ");
        flex.setText(2, 1, "100%");
        flex.setText(2, 2, "87.31%");
        flex.setText(2, 3, "87.31%");
        flex.setText(2, 4, "0.96");
        flex.setText(2, 5, "40%");

        flex.setText(3, 0, "Выезды группы РМ ОДПЗ");
        flex.setText(3, 1, "100%");
        flex.setText(3, 2, "110.37%");
        flex.setText(3, 3, "110.37%");
        flex.setText(3, 4, "1");
        flex.setText(3, 5, "30%");





        flex.setText(4, 0, "Урегулирование");
        flex.setText(4, 1, "74%");
        flex.setText(4, 2, "Коэффициент загрузки РМ ОДПЗ");
        flex.setText(4, 3, "100%");
        flex.setText(4, 4, "116.67%");
        flex.setText(4, 5, "116.67%");
        flex.setText(4, 6, "1");

        flex.setText(5, 0, "Урегулирование");
        flex.setText(5, 1, "74%");
        flex.setText(5, 2, "Нагрузка группы РМ ОДПЗ");
        flex.setText(5, 3, "100%");
        flex.setText(5, 4, "112%");
        flex.setText(5, 5, "112%");
        flex.setText(5, 6, "1");
        flex.getFlexCellFormatter().setRowSpan(1, 0, 3);
        flex.getFlexCellFormatter().setRowSpan(1, 1, 3);
        flex.getCellFormatter().addStyleName(1,0, "ff");

    }

}