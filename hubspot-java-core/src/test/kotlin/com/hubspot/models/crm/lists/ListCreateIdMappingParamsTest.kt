// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListCreateIdMappingParamsTest {

    @Test
    fun create() {
        ListCreateIdMappingParams.builder().addBody("string").build()
    }

    @Test
    fun body() {
        val params = ListCreateIdMappingParams.builder().addBody("string").build()

        val body = params._body()

        assertThat(body).containsExactly("string")
    }
}
