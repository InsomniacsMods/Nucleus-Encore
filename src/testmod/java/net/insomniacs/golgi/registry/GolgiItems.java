package net.insomniacs.golgi.registry;

import net.insomniacs.golgi.content.item.BreadstickBasket;
import net.insomniacs.nucleus.api.annotations.Translate;
import net.insomniacs.nucleus.api.components.FontChangingComponent;
import net.insomniacs.nucleus.impl.components.NucleusComponents;
import net.insomniacs.nucleus.api.items.LocationBindingItem;
import net.insomniacs.nucleus.api.items.SignFontChangingItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import static net.insomniacs.golgi.Golgi.REGISTRY;

public class GolgiItems {

    public static void init() {}

    @Translate(name="AAAAAAAA")
    public static final Item REDSTONE_TRACKER = REGISTRY.item(
            "redstone_tracker",
            new LocationBindingItem(new Item.Settings())
    );

    public static final Item ILLAGER_RUNE = REGISTRY.item(
            "illager_rune",
            new SignFontChangingItem(
                    new Item.Settings()
                            .component(NucleusComponents.FONT_CHANGING, new FontChangingComponent(new Identifier("minecraft", "illageralt"), true)),
                    SoundEvents.ITEM_DYE_USE
            )
    );

    public static final Item BREADSTICK_BASKET = REGISTRY.item(
            "breadstick_basket",
            new BreadstickBasket(new Item.Settings().unstackable())
    );

}