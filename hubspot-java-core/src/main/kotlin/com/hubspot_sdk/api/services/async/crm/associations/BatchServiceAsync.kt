// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    fun create(
        toObjectId: String,
        params: BatchCreateParams,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(toObjectId, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectId: String,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see create */
    fun create(
        params: BatchCreateParams
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation>

    /** Batch delete associations for objects */
    fun delete(
        toObjectType: String,
        params: BatchDeleteParams,
    ): CompletableFuture<BatchResponseVoid> = delete(toObjectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectType: String,
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid> =
        delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: BatchDeleteParams): CompletableFuture<BatchResponseVoid> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid>

    /** Create the default (most generic) association type between two object types */
    fun createDefault(
        toObjectType: String,
        params: BatchCreateDefaultParams,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        createDefault(toObjectType, params, RequestOptions.none())

    /** @see createDefault */
    fun createDefault(
        toObjectType: String,
        params: BatchCreateDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        createDefault(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see createDefault */
    fun createDefault(
        params: BatchCreateDefaultParams
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        createDefault(params, RequestOptions.none())

    /** @see createDefault */
    fun createDefault(
        params: BatchCreateDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation>

    /**
     * Batch delete specific association labels for objects. Deleting an unlabeled association will
     * also delete all labeled associations between those two objects
     */
    fun deleteLabels(
        toObjectType: String,
        params: BatchDeleteLabelsParams,
    ): CompletableFuture<BatchResponseVoid> =
        deleteLabels(toObjectType, params, RequestOptions.none())

    /** @see deleteLabels */
    fun deleteLabels(
        toObjectType: String,
        params: BatchDeleteLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid> =
        deleteLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see deleteLabels */
    fun deleteLabels(params: BatchDeleteLabelsParams): CompletableFuture<BatchResponseVoid> =
        deleteLabels(params, RequestOptions.none())

    /** @see deleteLabels */
    fun deleteLabels(
        params: BatchDeleteLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid>

    /**
     * Batch read associations for objects to specific object type. The 'after' field in a returned
     * paging object can be added alongside the 'id' to retrieve the next page of associations from
     * that objectId. The 'link' field is deprecated and should be ignored. Note: The 'paging' field
     * will only be present if there are more pages and absent otherwise.
     */
    fun get(
        toObjectType: String,
        params: BatchGetParams,
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel> =
        get(toObjectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        toObjectType: String,
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel> =
        get(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see get */
    fun get(
        params: BatchGetParams
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel>

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/objects/2026-03/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [BatchServiceAsync.create].
         */
        fun create(
            toObjectId: String,
            params: BatchCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(toObjectId, params, RequestOptions.none())

        /** @see create */
        fun create(
            toObjectId: String,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see create */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/batch/archive`, but is
         * otherwise the same as [BatchServiceAsync.delete].
         */
        fun delete(
            toObjectType: String,
            params: BatchDeleteParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            delete(toObjectType, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            toObjectType: String,
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: BatchDeleteParams
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/batch/associate/default`, but
         * is otherwise the same as [BatchServiceAsync.createDefault].
         */
        fun createDefault(
            toObjectType: String,
            params: BatchCreateDefaultParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            createDefault(toObjectType, params, RequestOptions.none())

        /** @see createDefault */
        fun createDefault(
            toObjectType: String,
            params: BatchCreateDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            createDefault(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see createDefault */
        fun createDefault(
            params: BatchCreateDefaultParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            createDefault(params, RequestOptions.none())

        /** @see createDefault */
        fun createDefault(
            params: BatchCreateDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/batch/labels/archive`, but is
         * otherwise the same as [BatchServiceAsync.deleteLabels].
         */
        fun deleteLabels(
            toObjectType: String,
            params: BatchDeleteLabelsParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            deleteLabels(toObjectType, params, RequestOptions.none())

        /** @see deleteLabels */
        fun deleteLabels(
            toObjectType: String,
            params: BatchDeleteLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            deleteLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see deleteLabels */
        fun deleteLabels(
            params: BatchDeleteLabelsParams
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            deleteLabels(params, RequestOptions.none())

        /** @see deleteLabels */
        fun deleteLabels(
            params: BatchDeleteLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise
         * the same as [BatchServiceAsync.get].
         */
        fun get(
            toObjectType: String,
            params: BatchGetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>> =
            get(toObjectType, params, RequestOptions.none())

        /** @see get */
        fun get(
            toObjectType: String,
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>> =
            get(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see get */
        fun get(
            params: BatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>>
    }
}
