using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace Persona.Models
{
    public class Persona
    {
        public int DUI { get; set; }
        public string Nombre { get; set; }
        public string Apellido { get; set; }
        public DateTime FechaNac { get; set; }
        public string Direccion { get; set; }
        public string CorreoE { get; set; }
    }
    public class PersonaDBContext : DbContext
    {
        public DbSet<Persona> Personas { get; set; }
    }
}