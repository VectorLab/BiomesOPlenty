/*******************************************************************************
 * Copyright 2014, the Biomes O' Plenty Team
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/

package biomesoplenty.asm;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

//TODO: Remove this or the ModelBakeryTransformer. It shouldn't be needed.
public class BOPLoadingPlugin implements IFMLLoadingPlugin
{
    @Override
    public String[] getASMTransformerClass()
    {
	    return new String[] { ModelBakeryTransformer.class.getName() };
    }

    @Override
    public String getModContainerClass()
    {
	    return null;
    }

    @Override
    public String getSetupClass()
    {
	    return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
    }

    @Override
    public String getAccessTransformerClass()
    {
	    return null;
    }

}
