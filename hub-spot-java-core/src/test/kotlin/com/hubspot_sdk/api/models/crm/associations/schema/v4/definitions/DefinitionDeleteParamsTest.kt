// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionDeleteParamsTest {

    @Test
    fun create() {
        DefinitionDeleteParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .associationTypeId(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DefinitionDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .associationTypeId(0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        assertThat(params._pathParam(2)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
