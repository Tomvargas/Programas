#include<iostream.h>
#include<stdio.h>

using namespace std;

void talent();

main()
{
  int op;
  menu:
    cout<<endl<<"\t  <<< Tests >>>"<<endl;
    cout<<"1) test para saber tu talento.\n";
    cout<<"2) test\n";
    cout << "3) test\n";
    cout << "4) salir.\n";
    cout<< "> Ingrese una opcion: ";
    cin >> op;

    switch (op)
    {
    case 1:
      system("cls");
      talent();
      cout<<endl; system ("pause");
      goto menu;

  }

return(0);
}

void talent()
{
  int opc, val=0;
  //------------------------------------------------------------------
  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
  cout<<"\tComo crees que te ven los demas..."<<endl;
  cout<<"\t1) Expresivo."<<endl;
  cout<<"\t2) Inspirado."<<endl;
  cout<<"\t3) Apasionado."<<endl;
  cout<<"\t4) Activo."<<endl;
  cout<<"\t5) Conversador"<<endl;
  cout<<"\t6) Culto."<<endl;
  cout<<"\t7) Organizado."<<endl;
  cout << "> Ingrese una opcion: ";
  cin >> opc;
  switch (opc)
  {
    case 1:
      val = val + 20;
      break;
    case 2:
      val = val + 40;
      break;
    case 3:
      val = val + 30;
      break;
    case 4:
      val = val + 10;
      break;
    case 5:
      val = val + 60;
      break;
    case 6:
      val = val + 50;
      break;
    case 7:
      val = val + 70;
      break;
    }
  }while(opc>7);
  system("pause");  system("cls");
  //-----------------------------------------------------------------

  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
    cout<<"\t  Que disfrutas haciendo en tu tiempo libre..."<<endl;
    cout<<"\t1) Dibujar."<<endl;
    cout<<"\t2) Cantar."<<endl;
    cout<<"\t3) Practicar deporte."<<endl;
    cout<<"\t4) Bailar."<<endl;
    cout<<"\t5) Escribir"<<endl;
    cout<<"\t6) Hacer deberes."<<endl;
    cout<<"\t7) Organizar reuniones."<<endl;
    cout << "> Ingrese una opcion: ";
    cin >> opc;
    switch (opc)
    {
      case 1:
        val = val + 40;
        break;
      case 2:
        val = val + 30;
        break;
      case 3:
        val = val + 10;
        break;
      case 4:
        val = val + 20;
        break;
      case 5:
        val = val + 50;
        break;
      case 6:
        val = val + 70;
        break;
      case 7:
        val = val + 60;
        break;
    }
  }while(opc>7);
  system("pause");  system("cls");
  //--------------------------------------------------------------------
  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
    cout<<"\t  Que es lo que mas te gusta de ti..."<<endl;
    cout<<"\t1) Ser enerjetico/a."<<endl;
    cout<<"\t2) Ser habil en los calculos."<<endl;
    cout<<"\t3) Ser creativo/a."<<endl;
    cout<<"\t4) Escuchar buena musica."<<endl;
    cout<<"\t5) Ser buen imitador"<<endl;
    cout<<"\t6) Ser bueno enseñando."<<endl;
    cout<<"\t7) Ser bueno escribiendo."<<endl;
    cout << "> Ingrese una opcion: ";
    cin >> opc;
    switch (opc)
    {
      case 1:
        val = val + 10;
        break;
      case 2:
        val = val + 70;
        break;
      case 3:
        val = val + 40;
        break;
      case 4:
        val = val + 30;
        break;
      case 5:
        val = val + 20;
        break;
      case 6:
        val = val + 60;
        break;
      case 7:
        val = val + 50;
        break;
    }
  }while(opc>7);
  system("pause");  system("cls");
//-------------------------------------------------------------------
  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
    cout<<"\t  En una fiesta ¿que agrada de ti a los demas..."<<endl;
    cout<<"\t1) Los chistes, bailes."<<endl;
    cout<<"\t2) Ser buen anfrition."<<endl;
    cout<<"\t3) La decoracion."<<endl;
    cout<<"\t4) hacer desafios de inteligencia."<<endl;
    cout<<"\t5) hablar sobre la actualidad"<<endl;
    cout<<"\t6) cantar en la fiesta."<<endl;
    cout<<"\t7) mi estado fisico."<<endl;
    cout << "> Ingrese una opcion: ";
    cin >> opc;
    switch (opc)
    {
      case 1:
        val = val + 20;
        break;
      case 2:
        val = val + 60;
        break;
      case 3:
        val = val + 40;
        break;
      case 4:
        val = val + 70;
        break;
      case 5:
        val = val + 50;
        break;
      case 6:
        val = val + 30;
        break;
      case 7:
        val = val + 10;
        break;
    }
  }while(opc>7);
  system("pause");  system("cls");
  //------------------------------------------------------------------
  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
    cout<<"\t  Que materia se te hace mas facil..."<<endl;
    cout<<"\t1) Matematica."<<endl;
    cout<<"\t2) Gramatica."<<endl;
    cout<<"\t3) Arte."<<endl;
    cout<<"\t4) Musica."<<endl;
    cout<<"\t5) Deporte"<<endl;
    cout<<"\t6) Exprecion corporal."<<endl;
    cout<<"\t7) hablar de la tarea frente a los demas."<<endl;
    cout << "> Ingrese una opcion: ";
    cin >> opc;
    switch (opc)
    {
      case 1:
        val = val + 70;
        break;
      case 2:
        val = val + 50;
        break;
      case 3:
        val = val + 40;
        break;
      case 4:
        val = val + 30;
        break;
      case 5:
        val = val + 10;
        break;
      case 6:
        val = val + 20;
        break;
      case 7:
        val = val + 60;
        break;
      }
    }while(opc>7);
    system("pause");  system("cls");
  //----------------------------------------------------------------

  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
  cout<<"\t  que trabajo te gustaria tener..."<<endl;
  cout<<"\t1) Ingeniero."<<endl;
  cout<<"\t2) Actor."<<endl;
  cout<<"\t3) Periodista."<<endl;
  cout<<"\t4) Musico en banda."<<endl;
  cout<<"\t5) Jefe en una empresa"<<endl;
  cout<<"\t6) Diseñador."<<endl;
  cout<<"\t7) Entrenador."<<endl;
    cin>>opc;
      switch(opc)
      {
        case 1: val=val+70; break;
        case 2: val=val+20; break;
        case 3: val=val+50; break;
        case 4: val=val+30; break;
        case 5: val=val+60; break;
        case 6: val=val+40; break;
        case 7: val=val+10; break;
      }}while(opc>7);
      system("pause");  system("cls");
  //-----------------------------------------------------------------

  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
    cout<<"\t  ¿Que verias en la tv?"<<endl;
    cout<<"\t1) ESPN."<<endl;
    cout<<"\t2) Art attack."<<endl;
    cout<<"\t3) Un reality show."<<endl;
    cout<<"\t4) Un concierto en vivo."<<endl;
    cout<<"\t5) Documental sobre el Papa"<<endl;
    cout<<"\t6) programa de juegos de logica."<<endl;
    cout<<"\t7) History chanel."<<endl;
    cout << "> Ingrese una opcion: ";
    cin >> opc;
    switch (opc)
    {
      case 1:
        val = val + 10;
        break;
      case 2:
        val = val + 40;
        break;
      case 3:
        val = val + 20;
        break;
      case 4:
        val = val + 30;
        break;
      case 5:
        val = val + 60;
        break;
      case 6:
        val = val + 70;
        break;
      case 7:
        val = val + 50;
        break;
      }
    }while(opc>7);
    system("pause");  system("cls");
  //------------------------------------------------------------------

  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
    cout<<"\t  que personaje sientes que te representa mas..."<<endl;
    cout<<"\t1) Stephen Hawking."<<endl;
    cout<<"\t2) Lionel Messi."<<endl;
    cout<<"\t3) Miley Cyrus."<<endl;
    cout<<"\t4) MichaelJackson."<<endl;
    cout<<"\t5) Pablo Picasso"<<endl;
    cout<<"\t6) Pablo Neruda."<<endl;
    cout<<"\t7) Barack Obama."<<endl;
    cout << "> Ingrese una opcion: ";
    cin >> opc;
    switch (opc)
    {
      case 1:
        val = val + 70;
        break;
      case 2:
        val = val + 10;
        break;
      case 3:
        val = val + 20;
        break;
      case 4:
        val = val + 30;
        break;
      case 5:
        val = val + 40;
        break;
      case 6:
        val = val + 50;
        break;
      case 7:
        val = val + 60;
        break;
    }
  }while(opc>7);
  system("pause");  system("cls");
  //----------------------------------------------------------------

  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
    cout<<"\t  Que es el amor..."<<endl;
    cout<<"\t1) Un sentimiento."<<endl;
    cout<<"\t2) Una buena fuente de inspiracion."<<endl;
    cout<<"\t3) Algo hermoso que hay que expresar."<<endl;
    cout<<"\t4) La forma de sus labios, su silueta.. algo sublime."<<endl;
    cout<<"\t5) Algo complicado"<<endl;
    cout<<"\t6) Harias una buena charla para definir bien que es."<<endl;
    cout<<"\t7) El resultado donde ambos salen beneficiados o heridos."<<endl;
    cin>>opc;
    cout << "> Ingrese una opcion: ";
    switch (opc)
    {
      case 1:
        val = val + 10;
        break;
      case 2:
        val = val + 30;
        break;
      case 3:
        val = val + 20;
        break;
      case 4:
        val = val + 50;
        break;
      case 5:
        val = val + 40;
        break;
      case 6:
        val = val + 60;
        break;
      case 7:
        val = val + 70;
        break;
    }
  }while(opc>7);
  system("pause");  system("cls");

  //-----------------------------------------------------------------

  cout<<endl<<"\t  <<< QUE TALENTO TIENES >>>"<<endl;
  do{
    cout<<"\t  De las siguientes afirmaciones �cual no va contigo?"<<endl;
    cout<<"\t1) La creatividad."<<endl;
    cout<<"\t2) La timidez."<<endl;
    cout<<"\t3) Lo analitico."<<endl;
    cout<<"\t4) El orden."<<endl;
    cout<<"\t5) El silencio"<<endl;
    cout<<"\t6) Los negocios."<<endl;
    cout<<"\t7) La ortografia."<<endl;
    cin>>opc;
    cout << "> Ingrese una opcion: "

    switch (opc)
    {
      case 1:
        val = val + 70;
        break;
      case 2:
        val = val + 60;
        break;
      case 3:
        val = val + 50;
        break;
      case 4:
        val = val + 40;
        break;
      case 5:
        val = val + 30;
        break;
      case 6:
        val = val + 20;
        break;
      case 7:
        val = val + 10;
        break;
    }
  }while(opc>7);
  system("pause");  system("cls");

//----------------------------------------------------------------------
//----------------------------------------------------------------------

  if (val>99 && val<161)
  {
    cout<<endl<<"\t <<< TU TALENTO ES DEPORTIVO >>>"<<endl;
    cout<<"\tEres una persona activa y decidida. Tienes la habilidad, "<<endl
    <<"\tla constancia y probablemene el potencial para aprovechar el "<<endl
    <<"\trendimiento de tu cuerpo"<<endl;
  }

  if (val>169 && val<231)
  {
    cout<<endl<<"\t <<< TU TALENTO ES ACTUACION O DANZA >>>"<<endl;
    cout<<"\tEres una persona expresiva y usas naturalmente todo tu cuerpo, "<<endl
    <<"\tpara hacerlo. Lo tuyo va con los escenarios y luces. Ademas de que "<<endl
    <<"\tno pasas desapersivido/a"<<endl;
  }

  if (val>239 && val<341)
  {
    cout<<endl<<"\t <<< TU TALENTO ES LA MUSICA >>>"<<endl;
    cout<<"\tTienes problemas quedandete callado/a... y para ti la musica "<<endl
    <<"\thabla mas fuerte que las palabras. Probablemente tienes buena voz"<<endl
    <<"\to gran habilidad para algun instrumento."<<endl;
  }

  if (val>349 && val<441)
  {
    cout<<endl<<"\t <<< TU TALENTO ES ARTISTICO VISUAL >>>"<<endl;
    cout<<"\tYa sea dibujando, pintando, esculpiendo, pero tu gran  "<<endl
    <<"\thabilidad son las manualidades. probablemente tienes buen  "<<endl
    <<"\tgusto artistico y te apasiona expresarte a travez de esto"<<endl;
  }

  if (val>449 && val<541)
  {
    cout<<endl<<"\t <<< TU TALENTO ES ESCRITURA >>>"<<endl;
    cout<<"\tEres sencible, apasionado y buen lector. tienes la  "<<endl
    <<"\thabilidad de ser escritor. probablemente tienes buena  "<<endl
    <<"\tortografia, te manejas bien con la exprecion."<<endl;
  }

  if (val>99 && val<161)
  {
    cout<<endl<<"\t <<< TU TALENTO ES LIDERAZGO >>>"<<endl;
    cout<<"\tEres carismatico e innovador, tienes la habilidad para"<<endl
    <<"\tser una voz guia. Probablemente atraes cuando te comunicas"<<endl
    <<"\tcaes bien y siempre logras tus metas"<<endl;
  }

  if (val>629 && val<701)
  {
    cout<<endl<<"\t <<< TU TALENTO ES ANALITICO >>>"<<endl;
    cout<<"\tTienes la habilidad natural de la logica, aplicas la"<<endl
    <<"\tmatematica y te basas en hechos realos y concretos para "<<endl
    <<"\tresolver las cosas."<<endl;
  }
};
