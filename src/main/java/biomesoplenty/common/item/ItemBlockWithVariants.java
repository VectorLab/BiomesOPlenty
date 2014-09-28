/*******************************************************************************
 * Copyright 2014, the Biomes O' Plenty Team
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/

package biomesoplenty.common.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import biomesoplenty.api.block.BOPBlock;

public class ItemBlockWithVariants extends ItemBlock
{
    public ItemBlockWithVariants(Block block)
    {
	    super(block);
	    
        this.setMaxDurability(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int metadata)
    {
        return metadata;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
    	BOPBlock bopBlock = (BOPBlock)this.blockInstance;
    	
    	if (bopBlock.hasVariants())
    	{
    		Enum variant = bopBlock.getVariantFromMeta(stack.getMetadata());
    		
    		return super.getUnlocalizedName() + "." + ((IStringSerializable)variant).getName();
    	}
    	else return super.getUnlocalizedName();
    }
}
