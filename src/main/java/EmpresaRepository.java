
import org.springframework.data.jpa.repository.JpaRepository;

import com.meudominio.api.model.Empresa;

public interface EmpresaRepository extends JpaRepository < Empresa , Long >{
	Empresa findByCnpj(String cnpj);
}
