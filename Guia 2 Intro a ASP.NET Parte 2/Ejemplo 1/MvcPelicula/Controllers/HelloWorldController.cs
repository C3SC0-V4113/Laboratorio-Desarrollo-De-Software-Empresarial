using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MvcPelicula.Controllers
{
    public class HelloWorldController : Controller
    {
        //
        // GET: /HelloWorld/

        /*public string Index()
        {
            return "Esta es mi acción <b> predeterminada </b> ...";
        }*/
        public ActionResult Index()
        {
            return View();
        }
        //
        // GET: /HelloWorld/Welcome/
        /*public string Welcome(string nombre, int numVeces = 1)
        {
            return HttpUtility.HtmlEncode("Hola " + nombre + ", NumVeces es: " + numVeces);
        }*/
        public ActionResult Welcome(string nombre, string apellido, int numVeces = 1)
        {
            String[] mensajes = new String[numVeces];
            // GET: /HelloWorld/Welcome/?nombre=Francisco&apellido=Valle&numVeces=5
            for (int i = 0; i < numVeces; i++)
            {
                string plantilla = "Hola {0} {1}, este mensaje se ha repetido {2} veces";
                string Mensaje = String.Format(plantilla, nombre, apellido, i+1);
                mensajes[i] = Mensaje;
            }
            ViewBag.Textos = mensajes;
            return View();
        }

        // GET: /HelloWorld/PruebaID/
        public string PruebaID(string nombre, int ID = 1)
        {
            return HttpUtility.HtmlEncode("Hola " + nombre + ", ID: " + ID);
        }
    }
}