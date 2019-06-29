package pl.swozniak.recipeproject.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    protected BigDecimal amount;
    private UnitOfMeasureCommand unitOfMeasure;

}