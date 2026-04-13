// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.custom

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomGetParamsTest {

    @Test
    fun create() {
        CustomGetParams.builder()
            .objectType("objectType")
            .objectId("objectId")
            .archived(true)
            .addAssociation("string")
            .idProperty("idProperty")
            .addProperty("string")
            .addPropertiesWithHistory("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomGetParams.builder().objectType("objectType").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomGetParams.builder()
                .objectType("objectType")
                .objectId("objectId")
                .archived(true)
                .addAssociation("string")
                .idProperty("idProperty")
                .addProperty("string")
                .addPropertiesWithHistory("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("associations", listOf("string").joinToString(","))
                    .put("idProperty", "idProperty")
                    .put("properties", listOf("string").joinToString(","))
                    .put("propertiesWithHistory", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomGetParams.builder().objectType("objectType").objectId("objectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
