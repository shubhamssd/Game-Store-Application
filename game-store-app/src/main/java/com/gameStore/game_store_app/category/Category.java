package com.gameStore.game_store_app.category;

import com.gameStore.game_store_app.common.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends BaseEntity {
    private String name;
    private String description;
}
