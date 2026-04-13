// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.tasks.TaskCreateParams
import com.hubspot.models.crm.objects.tasks.TaskDeleteParams
import com.hubspot.models.crm.objects.tasks.TaskGetParams
import com.hubspot.models.crm.objects.tasks.TaskListPage
import com.hubspot.models.crm.objects.tasks.TaskListParams
import com.hubspot.models.crm.objects.tasks.TaskSearchParams
import com.hubspot.models.crm.objects.tasks.TaskUpdateParams
import com.hubspot.services.blocking.crm.objects.tasks.BatchService
import java.util.function.Consumer

interface TaskService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaskService

    fun batch(): BatchService

    /**
     * Create a task with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard tasks is provided.
     */
    fun create(params: TaskCreateParams): SimplePublicObject = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TaskCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            TaskCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{taskId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{taskId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(taskId: String, params: TaskUpdateParams): SimplePublicObject =
        update(taskId, params, RequestOptions.none())

    /** @see update */
    fun update(
        taskId: String,
        params: TaskUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see update */
    fun update(params: TaskUpdateParams): SimplePublicObject = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TaskUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of tasks. Control what is returned via the `properties` query param. */
    fun list(): TaskListPage = list(TaskListParams.none())

    /** @see list */
    fun list(
        params: TaskListParams = TaskListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskListPage

    /** @see list */
    fun list(params: TaskListParams = TaskListParams.none()): TaskListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TaskListPage =
        list(TaskListParams.none(), requestOptions)

    /** Move an Object identified by `{taskId}` to the recycling bin. */
    fun delete(taskId: String) = delete(taskId, TaskDeleteParams.none())

    /** @see delete */
    fun delete(
        taskId: String,
        params: TaskDeleteParams = TaskDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see delete */
    fun delete(taskId: String, params: TaskDeleteParams = TaskDeleteParams.none()) =
        delete(taskId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TaskDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TaskDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(taskId: String, requestOptions: RequestOptions) =
        delete(taskId, TaskDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{taskId}`. `{taskId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(taskId: String): SimplePublicObjectWithAssociations = get(taskId, TaskGetParams.none())

    /** @see get */
    fun get(
        taskId: String,
        params: TaskGetParams = TaskGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see get */
    fun get(
        taskId: String,
        params: TaskGetParams = TaskGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(taskId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaskGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: TaskGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(taskId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(taskId, TaskGetParams.none(), requestOptions)

    /**
     * Execute a search for tasks based on the provided criteria, including filters, properties, and
     * sorting options. This allows for retrieving tasks that match specific conditions or property
     * values.
     */
    fun search(params: TaskSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: TaskSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            TaskSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [TaskService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaskService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/tasks`, but is otherwise the
         * same as [TaskService.create].
         */
        @MustBeClosed
        fun create(params: TaskCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TaskCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                TaskCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/tasks/{taskId}`, but is
         * otherwise the same as [TaskService.update].
         */
        @MustBeClosed
        fun update(taskId: String, params: TaskUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(taskId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            taskId: String,
            params: TaskUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TaskUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TaskUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/tasks`, but is otherwise the
         * same as [TaskService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TaskListPage> = list(TaskListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TaskListParams = TaskListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: TaskListParams = TaskListParams.none()): HttpResponseFor<TaskListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TaskListPage> =
            list(TaskListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/tasks/{taskId}`, but is
         * otherwise the same as [TaskService.delete].
         */
        @MustBeClosed
        fun delete(taskId: String): HttpResponse = delete(taskId, TaskDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            taskId: String,
            params: TaskDeleteParams = TaskDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            taskId: String,
            params: TaskDeleteParams = TaskDeleteParams.none(),
        ): HttpResponse = delete(taskId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TaskDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TaskDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(taskId: String, requestOptions: RequestOptions): HttpResponse =
            delete(taskId, TaskDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/tasks/{taskId}`, but is
         * otherwise the same as [TaskService.get].
         */
        @MustBeClosed
        fun get(taskId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(taskId, TaskGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            taskId: String,
            params: TaskGetParams = TaskGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            taskId: String,
            params: TaskGetParams = TaskGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(taskId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TaskGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: TaskGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(taskId, TaskGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/tasks/search`, but is
         * otherwise the same as [TaskService.search].
         */
        @MustBeClosed
        fun search(
            params: TaskSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: TaskSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                TaskSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
