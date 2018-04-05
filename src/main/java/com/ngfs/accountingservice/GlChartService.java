/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngfs.accountingservice;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

/**
 *
 * @author hemel
 */
@Path("/glchart")
public class GlChartService {
    @GET
    public Response GetAll(){
        GlChart glChart1 = new GlChart();
        glChart1.setId("101");
        glChart1.setName("Asset");
        glChart1.setParentId("100");
        
        GlChart glChart2 = new GlChart();
        glChart2.setId("201");
        glChart2.setName("Liability");
        glChart2.setParentId("200");
        
        List<GlChart> glCharts = new ArrayList<GlChart>();
        glCharts.add(glChart1);
        glCharts.add(glChart2);
        glCharts.add(glChart1);
        glCharts.add(glChart2);
        
        GenericEntity<List<GlChart>> glChartWrapper = new GenericEntity<List<GlChart>>(glCharts){};
        return Response.ok(glChartWrapper).build();
    }
}
