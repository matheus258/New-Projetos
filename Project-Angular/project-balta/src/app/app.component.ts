import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Todo } from 'src/models/todo.models';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public mode = 'list';
  public todos: Todo[] = [];
  public title: String = 'Minhas Tarefas';
  public form: FormGroup;

  constructor( private formBuilder: FormBuilder) {
    this.form = this.formBuilder.group({
      title: ['', Validators.compose([
        Validators.minLength(3),
        Validators.maxLength(60),
        Validators.required
      ])]
    });
    /*
    this.todos.push(new Todo (1, 'passear com o cachorro', false));
    this.todos.push(new Todo (2, 'Ir ao supermercado', false));
    this.todos.push(new Todo (3, 'Cortar o cabelo', true));
    */
    this.load();
  }

  add() {
    const title = this.form.controls['title'].value;
    const id = this.todos.length + 1;
    this.todos.push(new Todo(id, title, false));
    this.save();
    this.clear();
  }

  clear() {
    this.form.reset();
  }

  remove(todo: Todo) {
    const index = this.todos.indexOf(todo);
    if (index !== -1) {
      this.todos.splice(index, 1);
    }
    this.save();

  };

  markAsDone(todo: Todo) {
    todo.done = true;
    this.save();
  };

  markAsUndone(todo: Todo) {
    todo.done = false;
    this.save();
  };


  save() {
    const data = JSON.stringify(this.todos);
    localStorage.setItem('todos', data);
  };

  load() {
    const data = localStorage.getItem('todos');
    if(data) {
      this.todos = JSON.parse(localStorage.getItem('todos') || '{}');
    } else {
      this.todos = [];
    }

  };

}
