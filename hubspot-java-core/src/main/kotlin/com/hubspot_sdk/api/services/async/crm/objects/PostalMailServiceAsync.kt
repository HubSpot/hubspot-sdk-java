// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailCreateParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailDeleteParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailGetParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailListPageAsync
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailListParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailSearchParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailUpdateParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailUpsertParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PostalMailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalMailServiceAsync

    /** Create a batch of postal mail objects. */
    fun create(params: PostalMailCreateParams): CompletableFuture<BatchResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostalMailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see create */
    fun create(
        batchInputSimplePublicObjectBatchInputForCreate:
            BatchInputSimplePublicObjectBatchInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        create(
            PostalMailCreateParams.builder()
                .batchInputSimplePublicObjectBatchInputForCreate(
                    batchInputSimplePublicObjectBatchInputForCreate
                )
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputSimplePublicObjectBatchInputForCreate:
            BatchInputSimplePublicObjectBatchInputForCreate
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        create(batchInputSimplePublicObjectBatchInputForCreate, RequestOptions.none())

    /** Update multiple postal mail objects in a single request. */
    fun update(params: PostalMailUpdateParams): CompletableFuture<BatchResponseSimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(
            PostalMailUpdateParams.builder()
                .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

    fun list(): CompletableFuture<PostalMailListPageAsync> = list(PostalMailListParams.none())

    /** @see list */
    fun list(
        params: PostalMailListParams = PostalMailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostalMailListPageAsync>

    /** @see list */
    fun list(
        params: PostalMailListParams = PostalMailListParams.none()
    ): CompletableFuture<PostalMailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PostalMailListPageAsync> =
        list(PostalMailListParams.none(), requestOptions)

    /** Archive a batch of postal mail objects using their IDs. */
    fun delete(params: PostalMailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PostalMailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(
        batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(
            PostalMailDeleteParams.builder()
                .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId
    ): CompletableFuture<Void?> = delete(batchInputSimplePublicObjectId, RequestOptions.none())

    /** Retrieve multiple postal mail objects using their internal IDs or unique property values. */
    fun get(params: PostalMailGetParams): CompletableFuture<BatchResponseSimplePublicObject> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PostalMailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        get(
            PostalMailGetParams.builder()
                .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        get(batchReadInputSimplePublicObjectId, RequestOptions.none())

    /** Search for postal mail objects using specific criteria in the request. */
    fun search(
        params: PostalMailSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PostalMailSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            PostalMailSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * Create or update postal mails identified by a unique property value as specified by the
     * `idProperty` query param. `idProperty` query param refers to a property whose values are
     * unique for the object.
     */
    fun upsert(
        params: PostalMailUpsertParams
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: PostalMailUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject>

    /** @see upsert */
    fun upsert(
        batchInputSimplePublicObjectBatchInputUpsert: BatchInputSimplePublicObjectBatchInputUpsert,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(
            PostalMailUpsertParams.builder()
                .batchInputSimplePublicObjectBatchInputUpsert(
                    batchInputSimplePublicObjectBatchInputUpsert
                )
                .build(),
            requestOptions,
        )

    /** @see upsert */
    fun upsert(
        batchInputSimplePublicObjectBatchInputUpsert: BatchInputSimplePublicObjectBatchInputUpsert
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(batchInputSimplePublicObjectBatchInputUpsert, RequestOptions.none())

    /**
     * A view of [PostalMailServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostalMailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail/batch/create`, but
         * is otherwise the same as [PostalMailServiceAsync.create].
         */
        fun create(
            params: PostalMailCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PostalMailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see create */
        fun create(
            batchInputSimplePublicObjectBatchInputForCreate:
                BatchInputSimplePublicObjectBatchInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(
                PostalMailCreateParams.builder()
                    .batchInputSimplePublicObjectBatchInputForCreate(
                        batchInputSimplePublicObjectBatchInputForCreate
                    )
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            batchInputSimplePublicObjectBatchInputForCreate:
                BatchInputSimplePublicObjectBatchInputForCreate
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(batchInputSimplePublicObjectBatchInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail/batch/update`, but
         * is otherwise the same as [PostalMailServiceAsync.update].
         */
        fun update(
            params: PostalMailUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see update */
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(
                PostalMailUpdateParams.builder()
                    .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                    .build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/postal_mail`, but is otherwise
         * the same as [PostalMailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(PostalMailListParams.none())

        /** @see list */
        fun list(
            params: PostalMailListParams = PostalMailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>>

        /** @see list */
        fun list(
            params: PostalMailListParams = PostalMailListParams.none()
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(PostalMailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail/batch/archive`,
         * but is otherwise the same as [PostalMailServiceAsync.delete].
         */
        fun delete(params: PostalMailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PostalMailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(
            batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(
                PostalMailDeleteParams.builder()
                    .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId
        ): CompletableFuture<HttpResponse> =
            delete(batchInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail/batch/read`, but
         * is otherwise the same as [PostalMailServiceAsync.get].
         */
        fun get(
            params: PostalMailGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PostalMailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see get */
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(
                PostalMailGetParams.builder()
                    .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see get */
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(batchReadInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail/search`, but is
         * otherwise the same as [PostalMailServiceAsync.search].
         */
        fun search(
            params: PostalMailSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: PostalMailSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                PostalMailSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail/batch/upsert`, but
         * is otherwise the same as [PostalMailServiceAsync.upsert].
         */
        fun upsert(
            params: PostalMailUpsertParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: PostalMailUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>>

        /** @see upsert */
        fun upsert(
            batchInputSimplePublicObjectBatchInputUpsert:
                BatchInputSimplePublicObjectBatchInputUpsert,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(
                PostalMailUpsertParams.builder()
                    .batchInputSimplePublicObjectBatchInputUpsert(
                        batchInputSimplePublicObjectBatchInputUpsert
                    )
                    .build(),
                requestOptions,
            )

        /** @see upsert */
        fun upsert(
            batchInputSimplePublicObjectBatchInputUpsert:
                BatchInputSimplePublicObjectBatchInputUpsert
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(batchInputSimplePublicObjectBatchInputUpsert, RequestOptions.none())
    }
}
