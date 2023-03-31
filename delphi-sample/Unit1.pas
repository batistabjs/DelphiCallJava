unit Unit1;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls, uSimpleBrowser, Vcl.Menus;

type
  TForm2 = class(TForm)
    MainMenu1: TMainMenu;
    MduloCooperativa1: TMenuItem;
    Abrir1: TMenuItem;
    procedure Abrir1Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form2: TForm2;

implementation

{$R *.dfm}

procedure TForm2.Abrir1Click(Sender: TObject);
begin
  Application.CreateForm(TForm1, Form1);
  Form1.ShowModal;
  Form1.Destroy;
end;

end.
