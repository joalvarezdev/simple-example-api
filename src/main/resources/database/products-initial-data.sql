-- Datos iniciales para productos
INSERT INTO products (sku, name, description, price, category, stock, active) VALUES
-- Productos de Tecnología
('TECH-DELL-XPS13-001', 'Laptop Dell XPS 13', 'Laptop ultrabook con procesador Intel Core i7, 16GB RAM, 512GB SSD', 1299.99, 'Tecnología', 15, true),
('TECH-APPL-IP15P-001', 'iPhone 15 Pro', 'Smartphone Apple con cámara de 48MP, chip A17 Pro, 128GB', 999.99, 'Tecnología', 25, true),
('TECH-SAMS-GS24-001', 'Samsung Galaxy S24', 'Smartphone Android con pantalla AMOLED 6.2", 256GB', 849.99, 'Tecnología', 20, true),
('TECH-APPL-MBA3-001', 'MacBook Air M3', 'Laptop Apple con chip M3, 8GB RAM, 256GB SSD', 1199.99, 'Tecnología', 10, true),
('TECH-APPL-APP2-001', 'AirPods Pro 2', 'Auriculares inalámbricos con cancelación de ruido activa', 249.99, 'Tecnología', 30, true),

-- Productos de Hogar
('HOME-NESP-CAF-001', 'Cafetera Nespresso', 'Máquina de café expreso automática con sistema de cápsulas', 149.99, 'Hogar', 12, true),
('HOME-DYSO-V15-001', 'Aspiradora Dyson V15', 'Aspiradora inalámbrica con tecnología de detección láser', 649.99, 'Hogar', 8, true),
('HOME-PHIL-AFR-001', 'Air Fryer Philips', 'Freidora de aire caliente 4.1L, sin aceite', 179.99, 'Hogar', 18, true),
('HOME-ROOM-ASP-001', 'Robot Aspirador Roomba', 'Robot de limpieza inteligente con mapeo automático', 399.99, 'Hogar', 6, true),
('HOME-PURE-AIR-001', 'Purificador de Aire', 'Purificador HEPA para espacios hasta 40m²', 289.99, 'Hogar', 14, true),

-- Productos de Deporte
('SPRT-TREK-MTB-001', 'Bicicleta de Montaña Trek', 'Bicicleta MTB con suspensión completa, 29 pulgadas', 1899.99, 'Deportes', 5, true),
('SPRT-NIKE-AMX-001', 'Zapatillas Nike Air Max', 'Zapatillas deportivas con tecnología Air Max cushioning', 129.99, 'Deportes', 35, true),
('SPRT-MANC-ADJ-001', 'Mancuernas Ajustables', 'Set de mancuernas de 5 a 25kg cada una', 299.99, 'Deportes', 22, true),
('SPRT-NORD-CIN-001', 'Cinta de Correr NordicTrack', 'Cinta eléctrica plegable con inclinación automática', 1299.99, 'Deportes', 3, true),
('SPRT-YOGA-PEL-001', 'Pelota de Yoga', 'Pelota de ejercicio antideslizante 65cm', 24.99, 'Deportes', 45, true),

-- Productos de Libros
('BOOK-MART-CCO-001', 'Clean Code', 'Libro sobre programación limpia por Robert C. Martin', 42.99, 'Libros', 28, true),
('BOOK-CERV-QUI-001', 'El Quijote', 'Clásico de la literatura española de Miguel de Cervantes', 18.99, 'Libros', 40, true),
('BOOK-HARA-SAP-001', 'Sapiens', 'Historia de la humanidad por Yuval Noah Harari', 24.99, 'Libros', 32, true),
('BOOK-CLEA-ATH-001', 'Atomic Habits', 'Guía sobre formación de hábitos por James Clear', 19.99, 'Libros', 50, true),
('BOOK-SPRI-BOO-001', 'Spring Boot en Acción', 'Guía práctica para desarrollo con Spring Boot', 55.99, 'Libros', 15, true),

-- Productos de Ropa
('CLOT-NIKE-DRI-001', 'Camiseta Nike Dri-FIT', 'Camiseta deportiva de secado rápido', 29.99, 'Ropa', 60, true),
('CLOT-LEVI-501-001', 'Jeans Levi''s 501', 'Jeans clásicos de corte recto', 79.99, 'Ropa', 40, true),
('CLOT-NORF-JAC-001', 'Chaqueta North Face', 'Chaqueta impermeable para senderismo', 199.99, 'Ropa', 15, true),
('CLOT-CONV-ALL-001', 'Zapatillas Converse All Star', 'Zapatillas casual clásicas de lona', 69.99, 'Ropa', 55, true),
('CLOT-ADID-SUD-001', 'Sudadera Adidas', 'Sudadera con capucha de algodón orgánico', 59.99, 'Ropa', 38, true),

-- Productos descontinuados (para pruebas)
('MISC-DISC-PRD-001', 'Producto Descontinuado', 'Este producto ya no está disponible', 99.99, 'Varios', 0, false);

-- Actualizar timestamp de updated_at para todos los productos
UPDATE products SET updated_at = CURRENT_TIMESTAMP WHERE updated_at IS NULL;