// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.mapping

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MappingBatchCreateIdMappingParamsTest {

    @Test
    fun create() {
        MappingBatchCreateIdMappingParams.builder().addBody("string").build()
    }

    @Test
    fun body() {
        val params = MappingBatchCreateIdMappingParams.builder().addBody("string").build()

        val body = params._body()

        assertThat(body).containsExactly("string")
    }
}
