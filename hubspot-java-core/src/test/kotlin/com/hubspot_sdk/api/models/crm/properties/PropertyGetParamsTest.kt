// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyGetParamsTest {

    @Test
    fun create() {
        PropertyGetParams.builder()
            .objectType("objectType")
            .propertyName("propertyName")
            .archived(true)
            .dataSensitivity(PropertyGetParams.DataSensitivity.HIGHLY_SENSITIVE)
            .locale("locale")
            .properties("properties")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertyGetParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PropertyGetParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .archived(true)
                .dataSensitivity(PropertyGetParams.DataSensitivity.HIGHLY_SENSITIVE)
                .locale("locale")
                .properties("properties")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("dataSensitivity", "highly_sensitive")
                    .put("locale", "locale")
                    .put("properties", "properties")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PropertyGetParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
