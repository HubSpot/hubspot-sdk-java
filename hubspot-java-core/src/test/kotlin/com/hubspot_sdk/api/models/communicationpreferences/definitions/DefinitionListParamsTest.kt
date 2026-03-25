// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences.definitions

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionListParamsTest {

    @Test
    fun create() {
        DefinitionListParams.builder().businessUnitId(0L).includeTranslations(true).build()
    }

    @Test
    fun queryParams() {
        val params =
            DefinitionListParams.builder().businessUnitId(0L).includeTranslations(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("businessUnitId", "0")
                    .put("includeTranslations", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DefinitionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
