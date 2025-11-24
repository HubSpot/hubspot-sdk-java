// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyTest {

    @Test
    fun create() {
        val property =
            Property.builder()
                .description("description")
                .fieldType("select")
                .groupName("my_object_information")
                .label("My object property")
                .name("my_object_property")
                .addOption(
                    Option.builder()
                        .hidden(false)
                        .label("Option A")
                        .value("A")
                        .description("Choice number one")
                        .displayOrder(1)
                        .build()
                )
                .addOption(
                    Option.builder()
                        .hidden(false)
                        .label("Option B")
                        .value("B")
                        .description("Choice number two")
                        .displayOrder(2)
                        .build()
                )
                .type("enumeration")
                .archived(true)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .calculated(true)
                .calculationFormula("calculationFormula")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdUserId("createdUserId")
                .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                .displayOrder(2)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(false)
                .hidden(true)
                .hubspotDefined(true)
                .modificationMetadata(
                    PropertyModificationMetadata.builder()
                        .archivable(true)
                        .readOnlyDefinition(false)
                        .readOnlyValue(false)
                        .readOnlyOptions(false)
                        .build()
                )
                .referencedObjectType("referencedObjectType")
                .addSensitiveDataCategory("string")
                .showCurrencySymbol(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedUserId("updatedUserId")
                .build()

        assertThat(property.description()).isEqualTo("description")
        assertThat(property.fieldType()).isEqualTo("select")
        assertThat(property.groupName()).isEqualTo("my_object_information")
        assertThat(property.label()).isEqualTo("My object property")
        assertThat(property.name()).isEqualTo("my_object_property")
        assertThat(property.options())
            .containsExactly(
                Option.builder()
                    .hidden(false)
                    .label("Option A")
                    .value("A")
                    .description("Choice number one")
                    .displayOrder(1)
                    .build(),
                Option.builder()
                    .hidden(false)
                    .label("Option B")
                    .value("B")
                    .description("Choice number two")
                    .displayOrder(2)
                    .build(),
            )
        assertThat(property.type()).isEqualTo("enumeration")
        assertThat(property.archived()).contains(true)
        assertThat(property.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.calculated()).contains(true)
        assertThat(property.calculationFormula()).contains("calculationFormula")
        assertThat(property.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.createdUserId()).contains("createdUserId")
        assertThat(property.dataSensitivity()).contains(Property.DataSensitivity.HIGHLY_SENSITIVE)
        assertThat(property.displayOrder()).contains(2)
        assertThat(property.externalOptions()).contains(true)
        assertThat(property.formField()).contains(true)
        assertThat(property.hasUniqueValue()).contains(false)
        assertThat(property.hidden()).contains(true)
        assertThat(property.hubspotDefined()).contains(true)
        assertThat(property.modificationMetadata())
            .contains(
                PropertyModificationMetadata.builder()
                    .archivable(true)
                    .readOnlyDefinition(false)
                    .readOnlyValue(false)
                    .readOnlyOptions(false)
                    .build()
            )
        assertThat(property.referencedObjectType()).contains("referencedObjectType")
        assertThat(property.sensitiveDataCategories().getOrNull()).containsExactly("string")
        assertThat(property.showCurrencySymbol()).contains(true)
        assertThat(property.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.updatedUserId()).contains("updatedUserId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val property =
            Property.builder()
                .description("description")
                .fieldType("select")
                .groupName("my_object_information")
                .label("My object property")
                .name("my_object_property")
                .addOption(
                    Option.builder()
                        .hidden(false)
                        .label("Option A")
                        .value("A")
                        .description("Choice number one")
                        .displayOrder(1)
                        .build()
                )
                .addOption(
                    Option.builder()
                        .hidden(false)
                        .label("Option B")
                        .value("B")
                        .description("Choice number two")
                        .displayOrder(2)
                        .build()
                )
                .type("enumeration")
                .archived(true)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .calculated(true)
                .calculationFormula("calculationFormula")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdUserId("createdUserId")
                .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                .displayOrder(2)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(false)
                .hidden(true)
                .hubspotDefined(true)
                .modificationMetadata(
                    PropertyModificationMetadata.builder()
                        .archivable(true)
                        .readOnlyDefinition(false)
                        .readOnlyValue(false)
                        .readOnlyOptions(false)
                        .build()
                )
                .referencedObjectType("referencedObjectType")
                .addSensitiveDataCategory("string")
                .showCurrencySymbol(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedUserId("updatedUserId")
                .build()

        val roundtrippedProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(property),
                jacksonTypeRef<Property>(),
            )

        assertThat(roundtrippedProperty).isEqualTo(property)
    }
}
