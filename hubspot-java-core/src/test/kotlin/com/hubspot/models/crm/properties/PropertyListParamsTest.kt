// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.properties

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyListParamsTest {

    @Test
    fun create() {
        PropertyListParams.builder()
            .objectType("objectType")
            .archived(true)
            .dataSensitivity(PropertyListParams.DataSensitivity.HIGHLY_SENSITIVE)
            .locale("locale")
            .properties("properties")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PropertyListParams.builder().objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PropertyListParams.builder()
                .objectType("objectType")
                .archived(true)
                .dataSensitivity(PropertyListParams.DataSensitivity.HIGHLY_SENSITIVE)
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
        val params = PropertyListParams.builder().objectType("objectType").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
