// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associationsschema.labels

import com.hubspot.models.crm.associationsschema.PublicAssociationDefinitionCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LabelCreateLabelParamsTest {

    @Test
    fun create() {
        LabelCreateLabelParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .publicAssociationDefinitionCreateRequest(
                PublicAssociationDefinitionCreateRequest.builder()
                    .label("label")
                    .name("name")
                    .inverseLabel("inverseLabel")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LabelCreateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionCreateRequest(
                    PublicAssociationDefinitionCreateRequest.builder()
                        .label("label")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LabelCreateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionCreateRequest(
                    PublicAssociationDefinitionCreateRequest.builder()
                        .label("label")
                        .name("name")
                        .inverseLabel("inverseLabel")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicAssociationDefinitionCreateRequest.builder()
                    .label("label")
                    .name("name")
                    .inverseLabel("inverseLabel")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LabelCreateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionCreateRequest(
                    PublicAssociationDefinitionCreateRequest.builder()
                        .label("label")
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicAssociationDefinitionCreateRequest.builder()
                    .label("label")
                    .name("name")
                    .build()
            )
    }
}
