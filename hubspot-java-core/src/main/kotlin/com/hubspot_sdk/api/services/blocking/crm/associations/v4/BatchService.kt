// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.associations.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponsePublicAssociationMultiWithLabel
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchCreateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchGetParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchUpsertParams
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Batch create associations for objects */
    fun create(
        toObjectType: String,
        params: BatchCreateParams,
    ): BatchResponseLabelsBetweenObjectPair = create(toObjectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectType: String,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseLabelsBetweenObjectPair =
        create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): BatchResponseLabelsBetweenObjectPair =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseLabelsBetweenObjectPair

    /** Batch delete associations for objects */
    fun delete(toObjectType: String, params: BatchDeleteParams): BatchResponseVoid =
        delete(toObjectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectType: String,
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid =
        delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: BatchDeleteParams): BatchResponseVoid = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid

    /** Create the default (most generic) association type between two object types */
    fun createDefault(
        toObjectType: String,
        params: BatchCreateDefaultParams,
    ): BatchResponsePublicDefaultAssociation =
        createDefault(toObjectType, params, RequestOptions.none())

    /** @see createDefault */
    fun createDefault(
        toObjectType: String,
        params: BatchCreateDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation =
        createDefault(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see createDefault */
    fun createDefault(params: BatchCreateDefaultParams): BatchResponsePublicDefaultAssociation =
        createDefault(params, RequestOptions.none())

    /** @see createDefault */
    fun createDefault(
        params: BatchCreateDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation

    /**
     * Batch delete specific association labels for objects. Deleting an unlabeled association will
     * also delete all labeled associations between those two objects
     */
    fun deleteLabels(toObjectType: String, params: BatchDeleteLabelsParams): BatchResponseVoid =
        deleteLabels(toObjectType, params, RequestOptions.none())

    /** @see deleteLabels */
    fun deleteLabels(
        toObjectType: String,
        params: BatchDeleteLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid =
        deleteLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see deleteLabels */
    fun deleteLabels(params: BatchDeleteLabelsParams): BatchResponseVoid =
        deleteLabels(params, RequestOptions.none())

    /** @see deleteLabels */
    fun deleteLabels(
        params: BatchDeleteLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid

    /**
     * Batch read associations for objects to specific object type. The 'after' field in a returned
     * paging object can be added alongside the 'id' to retrieve the next page of associations from
     * that objectId. The 'link' field is deprecated and should be ignored. Note: The 'paging' field
     * will only be present if there are more pages and absent otherwise.
     */
    fun get(
        toObjectType: String,
        params: BatchGetParams,
    ): BatchResponsePublicAssociationMultiWithLabel =
        get(toObjectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        toObjectType: String,
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationMultiWithLabel =
        get(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see get */
    fun get(params: BatchGetParams): BatchResponsePublicAssociationMultiWithLabel =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationMultiWithLabel

    /**
     * Upsert a batch of CRM objects, creating new records or updating existing ones based on their
     * internal IDs or unique property values.
     */
    fun upsert(
        objectType: String,
        params: BatchUpsertParams,
    ): BatchResponseSimplePublicUpsertObject = upsert(objectType, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        objectType: String,
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicUpsertObject =
        upsert(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: BatchUpsertParams): BatchResponseSimplePublicUpsertObject =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicUpsertObject

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/create`, but is otherwise the
         * same as [BatchService.create].
         */
        @MustBeClosed
        fun create(
            toObjectType: String,
            params: BatchCreateParams,
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair> =
            create(toObjectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            toObjectType: String,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair> =
            create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/archive`, but is otherwise the
         * same as [BatchService.delete].
         */
        @MustBeClosed
        fun delete(
            toObjectType: String,
            params: BatchDeleteParams,
        ): HttpResponseFor<BatchResponseVoid> = delete(toObjectType, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            toObjectType: String,
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid> =
            delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: BatchDeleteParams): HttpResponseFor<BatchResponseVoid> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/associate/default`, but is
         * otherwise the same as [BatchService.createDefault].
         */
        @MustBeClosed
        fun createDefault(
            toObjectType: String,
            params: BatchCreateDefaultParams,
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            createDefault(toObjectType, params, RequestOptions.none())

        /** @see createDefault */
        @MustBeClosed
        fun createDefault(
            toObjectType: String,
            params: BatchCreateDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            createDefault(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see createDefault */
        @MustBeClosed
        fun createDefault(
            params: BatchCreateDefaultParams
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            createDefault(params, RequestOptions.none())

        /** @see createDefault */
        @MustBeClosed
        fun createDefault(
            params: BatchCreateDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/labels/archive`, but is
         * otherwise the same as [BatchService.deleteLabels].
         */
        @MustBeClosed
        fun deleteLabels(
            toObjectType: String,
            params: BatchDeleteLabelsParams,
        ): HttpResponseFor<BatchResponseVoid> =
            deleteLabels(toObjectType, params, RequestOptions.none())

        /** @see deleteLabels */
        @MustBeClosed
        fun deleteLabels(
            toObjectType: String,
            params: BatchDeleteLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid> =
            deleteLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see deleteLabels */
        @MustBeClosed
        fun deleteLabels(params: BatchDeleteLabelsParams): HttpResponseFor<BatchResponseVoid> =
            deleteLabels(params, RequestOptions.none())

        /** @see deleteLabels */
        @MustBeClosed
        fun deleteLabels(
            params: BatchDeleteLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise the
         * same as [BatchService.get].
         */
        @MustBeClosed
        fun get(
            toObjectType: String,
            params: BatchGetParams,
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel> =
            get(toObjectType, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            toObjectType: String,
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel> =
            get(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>

        /**
         * Returns a raw HTTP response for `post /crm/v4/objects/{objectType}/batch/upsert`, but is
         * otherwise the same as [BatchService.upsert].
         */
        @MustBeClosed
        fun upsert(
            objectType: String,
            params: BatchUpsertParams,
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(objectType, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            objectType: String,
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: BatchUpsertParams
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject>
    }
}
