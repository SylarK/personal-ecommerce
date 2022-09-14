package pt.amado.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.amado.ecommerce.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
