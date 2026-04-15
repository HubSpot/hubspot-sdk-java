// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectschemas

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaListParamsTest {

    @Test
    fun create() {
        ObjectSchemaListParams.builder()
            .archived(true)
            .includeAssociationDefinitions(true)
            .includeAuditMetadata(true)
            .includePropertyDefinitions(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ObjectSchemaListParams.builder()
                .archived(true)
                .includeAssociationDefinitions(true)
                .includeAuditMetadata(true)
                .includePropertyDefinitions(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("includeAssociationDefinitions", "true")
                    .put("includeAuditMetadata", "true")
                    .put("includePropertyDefinitions", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ObjectSchemaListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
