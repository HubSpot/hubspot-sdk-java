// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociationMultiWithLabel
import com.hubspot_sdk.api.models.crm.associations.batch.BatchCreateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchGetParams
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

    fun create(
        toObjectId: String,
        params: BatchCreateParams,
    ): BatchResponsePublicDefaultAssociation = create(toObjectId, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectId: String,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation =
        create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): BatchResponsePublicDefaultAssociation =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation

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

    /** Batch create the default (most generic) association type between two object types. */
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
     * Batch remove specific labelled associations between records in bulk. Deleting an unlabeled
     * association will also delete all labeled associations between those two objects
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

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/objects/2026-03/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [BatchService.create].
         */
        @MustBeClosed
        fun create(
            toObjectId: String,
            params: BatchCreateParams,
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            create(toObjectId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            toObjectId: String,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/batch/archive`, but is
         * otherwise the same as [BatchService.delete].
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
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/batch/associate/default`, but
         * is otherwise the same as [BatchService.createDefault].
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
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/batch/labels/archive`, but is
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
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise
         * the same as [BatchService.get].
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
    }
}
