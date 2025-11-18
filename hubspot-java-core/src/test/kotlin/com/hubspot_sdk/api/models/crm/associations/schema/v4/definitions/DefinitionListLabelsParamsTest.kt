// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionListLabelsParamsTest {

    @Test
    fun create() {
        DefinitionListLabelsParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DefinitionListLabelsParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
