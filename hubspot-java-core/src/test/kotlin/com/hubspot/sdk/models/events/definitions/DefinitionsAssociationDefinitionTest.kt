// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionsAssociationDefinitionTest {

    @Test
    fun create() {
        val definitionsAssociationDefinition =
            DefinitionsAssociationDefinition.builder()
                .id(0)
                .allowsCustomLabels(true)
                .cardinality(DefinitionsAssociationDefinition.Cardinality.ONE_TO_MANY)
                .category(DefinitionsAssociationDefinition.Category.HUBSPOT_DEFINED)
                .fromObjectTypeId("fromObjectTypeId")
                .hasAllAssociatedObjects(true)
                .hasCascadingDeletes(true)
                .hasUserEnforcedMaxFromObjectIds(true)
                .hasUserEnforcedMaxToObjectIds(true)
                .hidden(true)
                .inverseAllowsCustomLabels(true)
                .inverseCardinality(DefinitionsAssociationDefinition.InverseCardinality.ONE_TO_MANY)
                .inverseHasAllAssociatedObjects(true)
                .inverseId(0)
                .inverseName("inverseName")
                .isDefault(true)
                .isInversePrimary(true)
                .isPrimary(true)
                .maxFromObjectIds(0)
                .maxToObjectIds(0)
                .name("name")
                .portalUniqueIdentifier("portalUniqueIdentifier")
                .readOnly(true)
                .toObjectTypeId("toObjectTypeId")
                .fromObjectType(DefinitionsAssociationDefinition.FromObjectType.ABANDONED_CART)
                .hiddenReason(DefinitionsAssociationDefinition.HiddenReason.DEFAULT)
                .inverseLabel("inverseLabel")
                .label("label")
                .toObjectType(DefinitionsAssociationDefinition.ToObjectType.ABANDONED_CART)
                .build()

        assertThat(definitionsAssociationDefinition.id()).isEqualTo(0)
        assertThat(definitionsAssociationDefinition.allowsCustomLabels()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.cardinality())
            .isEqualTo(DefinitionsAssociationDefinition.Cardinality.ONE_TO_MANY)
        assertThat(definitionsAssociationDefinition.category())
            .isEqualTo(DefinitionsAssociationDefinition.Category.HUBSPOT_DEFINED)
        assertThat(definitionsAssociationDefinition.fromObjectTypeId())
            .isEqualTo("fromObjectTypeId")
        assertThat(definitionsAssociationDefinition.hasAllAssociatedObjects()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.hasCascadingDeletes()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.hasUserEnforcedMaxFromObjectIds())
            .isEqualTo(true)
        assertThat(definitionsAssociationDefinition.hasUserEnforcedMaxToObjectIds()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.hidden()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.inverseAllowsCustomLabels()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.inverseCardinality())
            .isEqualTo(DefinitionsAssociationDefinition.InverseCardinality.ONE_TO_MANY)
        assertThat(definitionsAssociationDefinition.inverseHasAllAssociatedObjects())
            .isEqualTo(true)
        assertThat(definitionsAssociationDefinition.inverseId()).isEqualTo(0)
        assertThat(definitionsAssociationDefinition.inverseName()).isEqualTo("inverseName")
        assertThat(definitionsAssociationDefinition.isDefault()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.isInversePrimary()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.isPrimary()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.maxFromObjectIds()).isEqualTo(0)
        assertThat(definitionsAssociationDefinition.maxToObjectIds()).isEqualTo(0)
        assertThat(definitionsAssociationDefinition.name()).isEqualTo("name")
        assertThat(definitionsAssociationDefinition.portalUniqueIdentifier())
            .isEqualTo("portalUniqueIdentifier")
        assertThat(definitionsAssociationDefinition.readOnly()).isEqualTo(true)
        assertThat(definitionsAssociationDefinition.toObjectTypeId()).isEqualTo("toObjectTypeId")
        assertThat(definitionsAssociationDefinition.fromObjectType())
            .contains(DefinitionsAssociationDefinition.FromObjectType.ABANDONED_CART)
        assertThat(definitionsAssociationDefinition.hiddenReason())
            .contains(DefinitionsAssociationDefinition.HiddenReason.DEFAULT)
        assertThat(definitionsAssociationDefinition.inverseLabel()).contains("inverseLabel")
        assertThat(definitionsAssociationDefinition.label()).contains("label")
        assertThat(definitionsAssociationDefinition.toObjectType())
            .contains(DefinitionsAssociationDefinition.ToObjectType.ABANDONED_CART)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val definitionsAssociationDefinition =
            DefinitionsAssociationDefinition.builder()
                .id(0)
                .allowsCustomLabels(true)
                .cardinality(DefinitionsAssociationDefinition.Cardinality.ONE_TO_MANY)
                .category(DefinitionsAssociationDefinition.Category.HUBSPOT_DEFINED)
                .fromObjectTypeId("fromObjectTypeId")
                .hasAllAssociatedObjects(true)
                .hasCascadingDeletes(true)
                .hasUserEnforcedMaxFromObjectIds(true)
                .hasUserEnforcedMaxToObjectIds(true)
                .hidden(true)
                .inverseAllowsCustomLabels(true)
                .inverseCardinality(DefinitionsAssociationDefinition.InverseCardinality.ONE_TO_MANY)
                .inverseHasAllAssociatedObjects(true)
                .inverseId(0)
                .inverseName("inverseName")
                .isDefault(true)
                .isInversePrimary(true)
                .isPrimary(true)
                .maxFromObjectIds(0)
                .maxToObjectIds(0)
                .name("name")
                .portalUniqueIdentifier("portalUniqueIdentifier")
                .readOnly(true)
                .toObjectTypeId("toObjectTypeId")
                .fromObjectType(DefinitionsAssociationDefinition.FromObjectType.ABANDONED_CART)
                .hiddenReason(DefinitionsAssociationDefinition.HiddenReason.DEFAULT)
                .inverseLabel("inverseLabel")
                .label("label")
                .toObjectType(DefinitionsAssociationDefinition.ToObjectType.ABANDONED_CART)
                .build()

        val roundtrippedDefinitionsAssociationDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(definitionsAssociationDefinition),
                jacksonTypeRef<DefinitionsAssociationDefinition>(),
            )

        assertThat(roundtrippedDefinitionsAssociationDefinition)
            .isEqualTo(definitionsAssociationDefinition)
    }
}
