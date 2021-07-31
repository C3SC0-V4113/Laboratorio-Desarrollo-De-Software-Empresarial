using System;
using System.Collections.Generic;
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
        public ActionResult Welcome(string nombre, int numVeces = 1)
        {
            ViewBag.Mensaje = "Hola " + nombre;
            ViewBag.NumVeces = numVeces;
            return View();
        }

        // GET: /HelloWorld/PruebaID/
        public string PruebaID(string nombre, int ID = 1)
        {
            return HttpUtility.HtmlEncode("Hola " + nombre + ", ID: " + ID);
        }
    }
}