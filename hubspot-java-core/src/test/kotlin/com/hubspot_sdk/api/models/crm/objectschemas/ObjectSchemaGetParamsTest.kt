// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectschemas

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaGetParamsTest {

    @Test
    fun create() {
        ObjectSchemaGetParams.builder()
            .objectType("objectType")
            .includeAssociationDefinitions(true)
            .includeAuditMetadata(true)
            .includePropertyDefinitions(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ObjectSchemaGetParams.builder().objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ObjectSchemaGetParams.builder()
                .objectType("objectType")
                .includeAssociationDefinitions(true)
                .includeAuditMetadata(true)
                .includePropertyDefinitions(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeAssociationDefinitions", "true")
                    .put("includeAuditMetadata", "true")
                    .put("includePropertyDefinitions", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ObjectSchemaGetParams.builder().objectType("objectType").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
