import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

void main() {
  runApp(const ProviderExercise());
}

class Counter with ChangeNotifier {
  int _count = 0;

  int get count => _count;

  void increment() {
    _count++;
    notifyListeners();
  }

  void decrement() {
    _count--;
    notifyListeners();
  }
}

class ProviderExercise extends StatelessWidget {
  const ProviderExercise({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ChangeNotifierProvider(
      create: (_) => Counter(),
      child: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatelessWidget {
  const MyHomePage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  Widget build(BuildContext context) {
    final counter = Provider.of<Counter>(context);

    return Scaffold(
      appBar: AppBar(
        title: Text(title),
        backgroundColor: Colors.blue,
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text('You have pushed the button this many times:'),
            Consumer<Counter>(
              builder: (context, counter, child) {
                return Text(
                  '${counter.count}',
                  style: Theme.of(context).textTheme.headlineMedium,
                );
              },
            ),
          ],
        ),
      ),
      floatingActionButton: Column(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [
          FloatingActionButton(
            onPressed: counter.increment,
            tooltip: 'Increment',
            child: const Icon(Icons.add),
            backgroundColor: Colors.blue,
          ),
          const SizedBox(height: 16),
          FloatingActionButton(
            onPressed: counter.decrement,
            tooltip: 'Decrement',
            child: const Icon(Icons.remove),
            backgroundColor: Colors.blue,
          ),
        ],
      ),
    );
  }
}
